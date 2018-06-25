package com.example.todo;

public class User {

    protected int id;

    protected String email;

    protected String family_name;

    protected String given_name;

    protected String uid;

    ///

    public int getId()
    {
        return this.id;
    }

    protected void setId(int id)
    {
        this.id = id;
    }

    //

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    //

    public String getFamilyName()
    {
        return this.family_name;
    }

    public void setFamilyName(String familyName)
    {
        this.family_name = familyName;
    }

    //

    public String getGivenName()
    {
        return this.given_name;
    }

    public void setGivenName(String givenName)
    {
        this.given_name = givenName;
    }

    //

    public String getUid()
    {
        return this.uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    ///

    public User(String uid, String givenName, String familyName, String email)
    {
        this.setUid(uid);

        this.setEmail(email);

        this.setGivenName(givenName);

        this.setFamilyName(familyName);
    }
}
