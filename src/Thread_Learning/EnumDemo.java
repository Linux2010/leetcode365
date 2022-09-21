package Thread_Learning;


public class EnumDemo {
}

enum CountryEnum{
    ONE(1,"qi"),TOW(2,"chu"),THREE(3,"yan");

    private Integer code;
    private String country;
    CountryEnum(int i, String s) {
        
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
