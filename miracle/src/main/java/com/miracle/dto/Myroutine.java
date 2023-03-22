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
public class Myroutine {
	private int routid;
	private String userid;
	private String routname;
	private String routcontent;
	private int routtime;
	private Date startdate;
	private Date enddate;
	private Date certifydate;
	private int reachcnt;
	private char chalapply;
}
