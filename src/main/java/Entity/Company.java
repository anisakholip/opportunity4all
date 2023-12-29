package Entity;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String description;
    private String location;
    private List<Campaign> campaigns;
    
    public Company(int id, String username, String password, String name, String email, String description, String location) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.description = description;
        this.location = location;
        this.campaigns = new ArrayList<>();
    }

    public Company(){  
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void addCampaign(Campaign campaign) {
        campaigns.add(campaign);
    }

    public void removeCampaign(Campaign campaign) {
        campaigns.remove(campaign);
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}