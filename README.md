# Java Stream API 테스트 프로젝트

Java 8에서 도입된 Stream API의 다양한 기능을 테스트하고 학습하기 위한 프로젝트입니다.

## 📋 프로젝트 개요

이 프로젝트는 Java Stream API의 주요 기능들을 실제 코드 예제를 통해 학습할 수 있도록 구성되어 있습니다. 각 클래스는 Stream API의 특정 기능에 초점을 맞춰 작성되었습니다.

## 🏗️ 프로젝트 구조

```
JavaStreamTest/
├── src/
│   ├── ArrayStreamTest.java        # 배열을 이용한 스트림 생성 및 처리
│   ├── BuilderStreamTest.java      # 스트림 빌더, 생성, 반복, 연결
│   ├── CollectionStreamTest.java   # 컬렉션을 이용한 스트림 처리
│   ├── EmptyStreamTest.java        # 빈 스트림 처리
│   ├── FilterStreamTest.java       # 스트림 필터링
│   ├── MapStreamTest.java          # 스트림 매핑 및 변환
│   ├── ParallelStreamTest.java     # 병렬 스트림 처리
│   ├── TypeStreamTest.java         # 타입별 스트림 처리
│   ├── Person.java                 # 테스트용 Person 클래스
│   └── Student.java                # 테스트용 Student 클래스
├── JavaStreamTest.iml
├── file.txt
└── README.md
```

## 📚 학습 내용

### 1. ArrayStreamTest.java

-   배열로부터 스트림 생성
-   배열의 일부분을 이용한 스트림 생성
-   기존 for문과 스트림 처리 방식 비교

### 2. BuilderStreamTest.java

-   Stream.builder()를 이용한 스트림 생성
-   Stream.generate()를 이용한 무한 스트림 생성
-   Stream.iterate()를 이용한 반복 스트림 생성
-   Stream.concat()을 이용한 스트림 연결

### 3. FilterStreamTest.java

-   filter() 메소드를 이용한 조건부 필터링
-   특정 조건을 만족하는 요소만 추출

### 4. MapStreamTest.java

-   map() 메소드를 이용한 요소 변환
-   Person 객체에서 특정 속성 추출
-   flatMap()을 이용한 중첩 구조 평면화
-   flatMapToInt()를 이용한 점수 평균 계산

### 5. 모델 클래스

-   **Person.java**: 이름, 나이, 키 속성을 가진 테스트용 클래스
-   **Student.java**: 이름, 국어, 영어, 수학 점수를 가진 테스트용 클래스

## 🚀 실행 방법

각 테스트 클래스는 독립적으로 실행 가능하며, main 메소드를 포함하고 있습니다.

```bash
# 컴파일
javac src/*.java

# 실행 예시
java -cp src ArrayStreamTest
java -cp src FilterStreamTest
java -cp src MapStreamTest
```

## 🎯 학습 목표

1. **Stream API 기본 개념** 이해
2. **다양한 스트림 생성 방법** 학습
3. **중간 연산과 최종 연산** 구분 및 활용
4. **함수형 프로그래밍** 패러다임 이해
5. **성능과 가독성** 향상을 위한 스트림 활용법

## 📖 주요 Stream API 메소드

-   `Arrays.stream()`: 배열을 스트림으로 변환
-   `Stream.builder()`: 빌더 패턴으로 스트림 생성
-   `Stream.generate()`: 공급자 함수로 무한 스트림 생성
-   `Stream.iterate()`: 초기값과 함수로 반복 스트림 생성
-   `filter()`: 조건에 맞는 요소 필터링
-   `map()`: 요소를 다른 타입으로 변환
-   `flatMap()`: 중첩된 구조를 평면화
-   `forEach()`: 각 요소에 대해 액션 수행

## 💡 참고사항

-   Java 8 이상 버전에서 실행 가능
-   각 테스트는 콘솔 출력을 통해 결과 확인 가능
-   실제 프로젝트에 적용하기 전 충분한 테스트 권장

---

_이 프로젝트는 Java Stream API 학습을 위한 교육 목적으로 제작되었습니다._
