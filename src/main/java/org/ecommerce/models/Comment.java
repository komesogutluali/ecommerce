package org.ecommerce.models;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "comment")
public class Comment {
    @Column(name = "comment_id")
    private Integer commentId;

    @Column(name = "comment_description")
    private String commentDescription;

    @Column(name = "commentator_name")
    private String commentatorName;

    @Column(name = "commentator_email")
    private String commentatorEmail;

    @Column(name = "members_id")
    private Integer membersId;

    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "comment_time")
    private Time commentTime;

    @Column(name = "comment_date")
    private java.sql.Date commentDate;

    public Integer getCommentId() {
        return this.commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentDescription() {
        return this.commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    public String getCommentatorName() {
        return this.commentatorName;
    }

    public void setCommentatorName(String commentatorName) {
        this.commentatorName = commentatorName;
    }

    public String getCommentatorEmail() {
        return this.commentatorEmail;
    }

    public void setCommentatorEmail(String commentatorEmail) {
        this.commentatorEmail = commentatorEmail;
    }

    public Integer getMembersId() {
        return this.membersId;
    }

    public void setMembersId(Integer membersId) {
        this.membersId = membersId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Time getCommentTime() {
        return this.commentTime;
    }

    public void setCommentTime(Time commentTime) {
        this.commentTime = commentTime;
    }

    public java.sql.Date getCommentDate() {
        return this.commentDate;
    }

    public void setCommentDate(java.sql.Date commentDate) {
        this.commentDate = commentDate;
    }
}
