package com.ait.SBCIG.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ait.SBCIG.generator.CustomIdGenerator;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name="user_details")
@Data
public class UserEntity {

	@Id
	@GenericGenerator(name = "user_id_gen", 
											strategy = "com.ait.SBCIG.generator.CustomIdGenerator", 
											parameters = {
													@Parameter(name = CustomIdGenerator.VALUE_PRIFIX_PARAMETER, value = "user_"),
													@Parameter(name = CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
													})
	@GeneratedValue(generator = "user_id_gen",strategy = GenerationType.SEQUENCE)
	@Column(name="user_id")
	private String userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_dob")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dob;
}
