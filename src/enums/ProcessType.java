package enums;

public enum ProcessType {
    SUM(1,"Toplama"),
    SUBTRACTION(2,"Çıkarma"),
    MULTIPLICATION(3,"Çarpma"),
    DIVISION(4,"Bölme"),
    EXPONENTIATION(5,"Üs alma"),
    SQUARE(6,"Karekök");


    String name;
    int code;
    ProcessType(int code,String name) {
        this.name = name;
        this.code = code;
    }


    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ProcessType findByCode(Integer code) {
        for (ProcessType e : ProcessType.values()) {
            if (e.code==code)
                return e;
        }
        throw new IllegalStateException(String.format("Unsupported type %s.", code));
    }
}
