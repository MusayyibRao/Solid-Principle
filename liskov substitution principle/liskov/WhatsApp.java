package liskov;

import liskov.SocialMedia;

public class WhatsApp extends SocialMedia
{

//support facebook,whatsapp,instagram
public void chatWithFriend()
{

}

//support facebook,instagram
public void publishPost(Object object)
{
// not applicable
}

//support facebook,whatsapp,instagram
public void sendPhotoAndvideos()
{


}

//support facebook,whatsapp,instagram
public void groupVideoCall(String... users)
{


}




}