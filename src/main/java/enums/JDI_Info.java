package enums;

public enum JDI_Info {
    JDI_URL("https://github.com/epam/JDI"),
    SUBHEADER_TITLE("JDI GITHUB"),
    USER_TABLE_PAGE_TITLE("User Table");

    String value;

    JDI_Info(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
