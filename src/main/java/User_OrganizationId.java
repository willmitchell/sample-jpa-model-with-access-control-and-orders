	public class User_OrganizationId implements java.io.Serializable {
			private long roleId;
			private long organizationId;
	
			public int hasCode() {
				return (int)(roleId + organizationId);
			}
	
			public boolean equals(Object object) {
	   			if (object instanceof User_OrganizationId) {
	      			User_OrganizationId otherId = (User_OrganizationId) object;
	      			return (otherId.roleId == this.roleId) && (otherId.organizationId == this.organizationId);
	   			}
	    		return false;
	  		}
		}
