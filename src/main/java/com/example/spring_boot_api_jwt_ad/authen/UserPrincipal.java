package com.example.spring_boot_api_jwt_ad.authen;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;




@Getter@Setter
public class UserPrincipal implements UserDetails {
    private Long userId;
    private String username;
    private String password;
    private Collection authorities;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUserId(Object id) {
		// TODO Auto-generated method stub
		
	}

	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(CharSequence password2) {
		// TODO Auto-generated method stub
		
	}

	public void setAuthorities(Set<String> authorities2) {
		// TODO Auto-generated method stub
		
	}
}
