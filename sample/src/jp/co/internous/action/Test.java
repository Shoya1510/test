package jp.co.internous.action;

public class Test {
public static void main(String[] args){

Person taro = new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="0";
taro.address="神奈川";

Person jiro=new Person();
jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="1";
jiro.address="東京";


Person hana=new Person();
hana.name="鈴木花子";
hana.age=16;
hana.phoneNumber="2";
hana.address="千葉";

Person sho=new Person();
sho.name="平野翔也";
sho.age=27;
sho.phoneNumber="3";
sho.address="埼玉";

System.out.println(taro.name);
System.out.println(taro.age);
System.out.println(taro.phoneNumber);
System.out.println(taro.address);
taro.talk();
taro.walk();
taro.run();


System.out.println(jiro.name);
System.out.println(jiro.age);
System.out.println(jiro.phoneNumber);
System.out.println(jiro.address);
jiro.talk();
jiro.walk();
jiro.run();

System.out.println(hana.name);
System.out.println(hana.age);
System.out.println(hana.phoneNumber);
System.out.println(hana.address);
hana.talk();
hana.walk();
hana.run();

System.out.println(sho.name);
System.out.println(sho.age);
System.out.println(sho.phoneNumber);
System.out.println(sho.address);
sho.talk();
sho.walk();
sho.run();



Robot aibo=new Robot();
aibo.name="aibo";

System.out.println(aibo.name);
aibo.talk();
aibo.walk();
aibo.run();

Robot asimo=new Robot();
asimo.name="asimo";

System.out.println(asimo.name);
asimo.talk();
asimo.walk();
asimo.run();



Robot papper=new Robot();
papper.name="papper";

System.out.println(papper.name);
papper.talk();
papper.walk();
papper.run();

}
}
