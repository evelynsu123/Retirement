package com.nttdata.project1.retirementservice.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class Retirement {
	private String id;
	private String idAccount;
	private String origin;
	private String currency;
	private double amount;
	private Date operationDate;
	private boolean active;
}

