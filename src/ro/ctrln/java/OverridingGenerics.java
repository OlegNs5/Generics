package ro.ctrln.java;

public class OverridingGenerics extends OverloadingGenerics {

    @Override
    public void showMessage(MessageProcesor<String> messageProcesor) {
        super.showMessage(messageProcesor);
    }
}
