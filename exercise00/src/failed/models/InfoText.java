package failed.models;

public class InfoText {
    private String buttonText;
    private String textText;
    private String volumeText;

    public InfoText() {
        buttonText = "";
        textText = "";
        volumeText = "";
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getTextText() {
        return textText;
    }

    public void setTextText(String textText) {
        this.textText = textText;
    }

    public String getVolumeText() {
        return volumeText;
    }

    public void setVolumeText(String volumeText) {
        this.volumeText = volumeText;
    }
}
