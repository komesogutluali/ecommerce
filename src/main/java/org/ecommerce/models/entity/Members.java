package org.ecommerce.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class Members {
    @Id
    @Column(name = "members_id")
    private Integer membersId;

    @Column(name = "members_name")
    private String membersName;

    @Column(name = "members_email")
    private String membersEmail;

    @Column(name = "members_number")
    private String membersNumber;

    @Column(name = "members_password")
    private String membersPassword;

    public Integer getMembersId() {
        return this.membersId;
    }

    public void setMembersId(Integer membersId) {
        this.membersId = membersId;
    }

    public String getMembersName() {
        return this.membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public String getMembersEmail() {
        return this.membersEmail;
    }

    public void setMembersEmail(String membersEmail) {
        this.membersEmail = membersEmail;
    }

    public String getMembersNumber() {
        return this.membersNumber;
    }

    public void setMembersNumber(String membersNumber) {
        this.membersNumber = membersNumber;
    }

    public String getMembersPassword() {
        return this.membersPassword;
    }

    public void setMembersPassword(String membersPassword) {
        this.membersPassword = membersPassword;
    }
}
