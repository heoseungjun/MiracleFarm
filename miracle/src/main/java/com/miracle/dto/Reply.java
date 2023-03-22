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
public class Reply {
	private int replyno;
	private String userid;
	private int writeno;
	private String replycontent;
	private String replyimg;
	private Date replydate;
}
