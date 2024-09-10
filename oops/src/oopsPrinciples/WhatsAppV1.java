package oopsPrinciples;

public class WhatsAppV1 {
	public void sendmsg() {
		System.out.println("message Sending...");
	}
}
class WhatsAppV2 extends WhatsAppV1{
	public void audioCall() {
		System.out.println("Audio Call");
	}
}
class WhatsAppV3 extends WhatsAppV2{
	public void videoCall() {
		System.out.println("Video Call");
	}
}
class MultilevelInheritance{
	public static void main(String[] args) {
		WhatsAppV1 v1 = new WhatsAppV1();
		v1.sendmsg();
		WhatsAppV2 v2 = new WhatsAppV2();
		v2.sendmsg();
		v2.audioCall();
		WhatsAppV3 v3 = new WhatsAppV3();
		v3.sendmsg();
		v3.audioCall();
		v3.videoCall();
	}
}