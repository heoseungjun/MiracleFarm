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
public class Community {
	private int writeno;
	private String userid;
	private String category;
	private String writetitle;
	private String writecontent;
	private String writeimg;
	private Date writedate;
}
