# aidlclient
<p>This is aidl client app here we will initialize aidlreciever service to  create a bridge between client and reciever.
Once  bridge created  then we can able to request data from service using aidl <b>interface<b>.<p>

<h3>Steps to see the communication.<h3>
 <ul>
  <li> Clone and load  aidl client into android studio.</li>
   <li> Clone and load  aidl reciever into android studio</li>
   
</ul>

<p>Now run reciver app and then run client app in clinet app you have to  put debug points in servicecommunication and aidl interface callbacks methods to check the flow.
  <br>Because i am not updating any ui in both apps as of now, so better to add debug points and check flow.
</p>

<b>Note:</b>
<p>Aidl have few rules while implementing.</br>
Aidl package name should same in client and reciver apps.</br>
And all methods inside aidl interface should be same in oreder wise in both client and reciever app.</p>

 
 
