let file;


export async function getFileData(){
    try{
        const [fileHandler] = await window.showOpenFilePicker();

        var fileData = await fileHandler.getFile();
        
      console.log("Opened file: ", fileData);
      
    } catch(error){
      console.log(error);
    }
}

export async function printFile(){
   try{
       
   }catch(error){
     console.log(error)
   }
}

// self explantory
//async function getRoot(){
//  return opfsRoot = await navigator.storage.getDirectory();
//}

// This function just gets the data of a file through a root
// dir handle and then retrieves the file contents througha buffer
//async function readFile(){
//  onmessage = (e){
//    const dirHandle =  await getRoot();
//    const fileHandle = await dirHandle.getFileHandle("draft.txt", { create: true });
//
//    const accessHandle = await fileHandle.createSyncAccessHandle();
//
//    const fileSize = accessHandle.getSize();
//
//    const buffer = new DataView(new ArrayBuffer(fileSize));
//    const readBuffer = accessHandle.read(buffer, {at: 0});
//
//    postMessage(readBuffer);
//    accessHandle.close();
//  };
//}
