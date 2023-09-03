package com.compositepk.api.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CompositePkId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer empId;
	private Integer deptId;

	/**
	 * 
	 */
	public CompositePkId() {
		super();
	}

	/**
	 * @param empId
	 * @param deptId
	 */
	public CompositePkId(Integer empId, Integer deptId) {
		super();
		this.empId = empId;
		this.deptId = deptId;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the deptId
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositePkId other = (CompositePkId) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		return true;
	}

}
