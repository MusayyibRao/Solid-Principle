package liskov;

public abstract class SocialMedia
{

//support facebook,whatsapp,instagram
public abstract void chatWithFriend();

//support facebook,instagram
public abstract void publishPost(Object object);

//support facebook,whatsapp,instagram
public abstract void sendPhotoAndvideos();

//support facebook,whatsapp,instagram
public abstract void groupVideoCall(String... users);



}