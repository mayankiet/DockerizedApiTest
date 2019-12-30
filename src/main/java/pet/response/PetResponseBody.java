package pet.response;

import java.util.List;

public class PetResponseBody {

    private List<String> photoUrls;
    private String name;
    private String id;
    private Category category;
    private List<Tags> tags;
    private String status;

    public List<String> getPhotoUrls ()
    {
        return photoUrls;
    }

    public void setPhotoUrls (List<String> photoUrls)
    {
        this.photoUrls = photoUrls;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Category getCategory ()
    {
        return category;
    }

    public void setCategory (Category category)
    {
        this.category = category;
    }

    public List<Tags> getTags ()
    {
        return tags;
    }

    public void setTags (List<Tags> tags)
    {
        this.tags = tags;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }
}
