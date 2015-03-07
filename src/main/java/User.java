
import java.util.Set;
import java.util.HashSet;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class User
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	 
	@javax.persistence.OneToMany(mappedBy = "user") 
	protected Set<Order> order;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id 
	@javax.persistence.Column(nullable = false) 
	protected final Long id = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(mappedBy = "user") 
	protected User_Organization organization;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public User(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetOrganization(User_Organization myOrganization) {
		if (this.organization != myOrganization) {
			if (myOrganization != null){
				if (this.organization != myOrganization) {
					User_Organization oldorganization = this.organization;
					this.organization = myOrganization;
					if (oldorganization != null)
						oldorganization.unsetUser();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Order> getOrder() {
		if(this.order == null) {
				this.order = new HashSet<Order>();
		}
		return (Set<Order>) this.order;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public User_Organization getOrganization() {
		return this.organization;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllOrder(Set<Order> newOrder) {
		if (this.order == null) {
			this.order = new HashSet<Order>();
		}
		for (Order tmp : newOrder)
			tmp.setUser(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllOrder(Set<Order> newOrder) {
		if(this.order == null) {
			return;
		}
		
		this.order.removeAll(newOrder);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addOrder(Order newOrder) {
		if(this.order == null) {
			this.order = new HashSet<Order>();
		}
		
		if (this.order.add(newOrder))
			newOrder.basicSetUser(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setOrganization(User_Organization myOrganization) {
		this.basicSetOrganization(myOrganization);
		myOrganization.basicSetUser(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeOrder(Order oldOrder) {
		if(this.order == null)
			return;
		
		if (this.order.remove(oldOrder))
			oldOrder.unsetUser();
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetOrganization() {
		if (this.organization == null)
			return;
		User_Organization oldorganization = this.organization;
		this.organization = null;
		oldorganization.unsetUser();	
	}
	
}

