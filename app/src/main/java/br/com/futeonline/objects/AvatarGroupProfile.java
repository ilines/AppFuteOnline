package br.com.futeonline.objects;



public class AvatarGroupProfile {


    private Long id;

    private String name;

    public AvatarGroupProfile() {
        this.id = null;
        this.name = "";
    }

    public AvatarGroupProfile(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}