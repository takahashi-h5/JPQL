package jp.co.confrage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="account")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountEntity {
	@EmbeddedId
	private Pk aaa;
	
	@Column(name="branch_number")
	private Integer branchNumber;
	
	@Column(name="deposit_amount")
	private Integer depositAmount;	
	@Embeddable
	@Data
	public static class Pk implements Serializable {
		private static final long serialVersionUID = 624797775027966843L;

		@Column(name="id")
		private String id;
		
		@Column(name="account_number")
		private String accountNumber;
		
	}
	
}
