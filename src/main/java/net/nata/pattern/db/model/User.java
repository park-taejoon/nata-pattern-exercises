package net.nata.pattern.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="t_user")
public class User{
	
	@Id
	@Column(name="user_cd")
	@GeneratedValue(strategy=GenerationType.AUTO)//ID가 자동으로 생성되어야 함
	long cd;
	@Column(name="user_id")
	@NonNull
	String id;
	@Column(name="user_email")
	@NonNull
	String email;
	@Column(name="user_password")
	String password;
	
	
}
