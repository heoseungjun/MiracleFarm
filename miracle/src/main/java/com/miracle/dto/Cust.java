package com.miracle.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cust {
	private String userid;
	private String userpwd;
	private String username;
	private String nicname;
	private String userimg;
	private String birth;
	private String tel_first;
	private String tel_second;
	private String tel_third;
	private Date joindate;
	private char routopen;
}
