package failed.models;

public class RadioButton {
    private final String label;
    private Boolean isSelected;

    public RadioButton(String label) {
        this.label = label;
        isSelected = false;
    }

    public String getLabel() {
        return label;
    }

    public void setSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }

    public Boolean getSelected() {
        return isSelected;
    }
}
