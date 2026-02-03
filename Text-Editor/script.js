// In this file we are concerned with creating and managing the line numbers

import {openFile} from "./file-functionality.js";

const newButton = document.getElementById("newFileButton");
const textArea = document.getElementById("textEditor");
const styles = window.getComputedStyle(textArea);
//const myWorker = new Worker(new URL ("file-functionality.js",
//import.meta.url));

// styles from text editing area
const textZone = {
    lineH: styles.lineHeight,
    width:  styles.width,
    background: styles.background,
    lineNum: textArea.childElementCount,
};

newButton.addEventListener("click", (e) =>{
    e.preventDefault();

    getFileData();
});

//openFile.addEventListener("click", (e) =>{
//  e.preventDefault();
//
//  return;
//})

// this is to change current line number on mouse click
textArea.addEventListener("click", (e) => {
    e.preventDefault();
    console.log(getLineNumber());
});

// need to detect line numbers when moving and creating new lines
textArea.addEventListener("keydown", event =>{
    switch (event.key){
        case "ArrowUp":
            console.log(getLineNumber());
            break;

        case "ArrowDown":
            console.log(getLineNumber());
            break;

        case "Enter":
            console.log(getLineNumber());
           break;

        case "Tab":
            event.preventDefault();
            insertTab();
            break;

        default:
            return;
    }
});

// line numbers weren't showing up at file load time
addEventListener("load", function (){
    let line = document.createElement("div");
    line.textContent = "\u200b"
    textArea.appendChild(line);
    textArea.focus();
   
});


function insertTab(){
    textArea.setAttribute("whitespace", "nowrap");

    let text = document.createTextNode("\t");

    let selection = window.getSelection(textArea);
    let range = document.createRange();
    range.setStart(selection.focusNode, 0);
    range.setEnd(selection.focusNode, selection.anchorOffset);


    range.collapse(false);
    range.insertNode(text);

    range.setStartAfter(text);
    range.setEndAfter(text);
    selection.setPosition(text, 1);
    selection.removeAllRanges;
}


// function to get current line number that the cursor is on
// using a doc fragment to from beginning of file to where the cursor is and 
// detecting how many child nodes there are because each line is a new <div> node
function getLineNumber() {
    let selection = window.getSelection(textArea);
    let outerRange = document.createRange();
    outerRange.setStart(textArea, 0);
    outerRange.setEnd(selection.focusNode, selection.focusOffset);

    var clone = outerRange.cloneContents();
    
    return clone.childElementCount;
}
