/**
 * 
 */
package campAssignments.databaseObjects;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Bert
 * Camp data access object
 */
@Entity
@Table(name = "camps")
public class Camp implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "camp_id")
    private long campId;

    @Column(name = "Description")
    private String description;
    
    @Column(name = "Start")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime startDate;

    @Column(name = "End")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime endDate;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
    	this.description = description; 
    }

    public LocalDateTime getStartDate() {
    	return startDate;
    }
    
    public void setStartDate(LocalDateTime startDate) {
    	this.startDate = startDate;
    }
    
    public LocalDateTime getEndDate() {
    	return endDate;
    }
    
    public void setEndDate(LocalDateTime endDate) {
    	this.endDate = endDate;
    }
    
}
