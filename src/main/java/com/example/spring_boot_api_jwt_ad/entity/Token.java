package com.example.spring_boot_api_jwt_ad.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_token")
@Getter
@Setter
public class Token extends BaseEntity {

    @Column(length = 1000)
    private String token;

    private Date tokenExpDate;

	public void setToken(String generateToken) {
		// TODO Auto-generated method stub
		
	}

	public void setTokenExpDate(Date generateExpirationDate) {
		// TODO Auto-generated method stub
		
	}

	public void setCreatedBy(Object userId) {
		// TODO Auto-generated method stub
		
	}

	public Object getToken(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getTokenExpDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
