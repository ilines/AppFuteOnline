package br.com.futeonline.objects;


public class TypeNotify {

    private Long id;
    private Languages languages;
    private String name;

    public TypeNotify() {
        this.id = null;
        this.languages = new Languages();
        this.name = "";
    }

    public TypeNotify(Long id, Languages languages, String name) {
        this.id = id;
        this.languages = languages;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}