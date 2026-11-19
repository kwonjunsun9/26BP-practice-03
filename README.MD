# 초급프로젝트 일반 분반 11주차 실습과제

Java로 싱글톤 패턴을 구현하고, 여러 참조가 하나의 인스턴스를 공유한다는 것을 실행 결과로 확인하였습니다.

## 실행 환경 및 방법

- 언어 및 검증 환경: Java 21
- JDK가 설치된 환경에서 아래 명령을 저장소 루트에서 실행

```sh
cd 26BP-practice-03
javac -encoding UTF-8 -d out SingletonCounter.java Main.java
java -cp out Main
```

## 실행 결과

<img width="378" height="67" alt="화면 캡처 2026-11-19 141938" src="https://github.com/user-attachments/assets/330e25a3-9c85-4caa-b321-36147caa6b2a" />

## 설명

싱글톤 객체는 SingletonCounter 클래스의 정적 필드인 instance에 보관합니다.
<br/>getInstance()를 처음 호출하면 instance가 null이어서 객체를 만들고 그 참조를 저장합니다. 이후에는 instance에 참조가 들어 있으므로 새 객체를 만드는 코드를 건너뛰고 저장된 참조를 반환합니다.
<br/>실행 결과 first == second가 true였으므로 두 변수가 같은 객체를 가리킨다는 것을 확인했습니다. first.increment()를 호출한 뒤 second.getCount()로 읽은 값도 0에서 1로 바뀌어 카운터 상태를 공유한다는 것을 확인했습니다.
