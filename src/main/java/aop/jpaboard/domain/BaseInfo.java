package aop.jpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter @Setter
public class BaseInfo {

    private String owner;
    private String address;
    private String phone;

    protected BaseInfo() {

    }

    public BaseInfo(String owner, String address, String phone) {
        this.owner = owner;
        this.address = address;
        this.phone = phone;
    }
}
