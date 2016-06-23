REM �ر����
@echo off

REM ��������ʱʹ�õ�jdk����������ã���ʹ��ϵͳ���������õ�jdk
set path=../jdk.1.7.80/bin
set classpath=../jdk.1.7.80/jre/lib

REM �������jar���������ʹ��MANIFEST�е����������
java -jar RoseClicky.jar

REM ָ��jar����ĳ������Ϊ�������
java -cp RoseClicky.jar com.eric.rose.RoseClicky

REM ����jvm����������jar��
java -Xms256m -Xmx512m -jar RoseClicky.jar

REM �������
echo on