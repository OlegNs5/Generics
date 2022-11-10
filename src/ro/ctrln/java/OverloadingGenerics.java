package ro.ctrln.java;

public class OverloadingGenerics {
    public void showMessage(MessageProcesor<String> messageProcesor){
        messageProcesor.printData("Mesaj !");
    }
//    public void showMessage(MessageProcesor<Integer> messageProcesor){
//        messageProcesor.printData(20);
//    }
}
