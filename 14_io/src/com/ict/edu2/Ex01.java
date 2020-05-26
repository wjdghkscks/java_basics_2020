package com.ict.edu2;

// [Stream 스트림]

//	- 데이터를 목적지까지 입/출력하기 위한 방법
//	- 출력 스트림: 스트림에서 데이터를 쓰는 경우
//	- 입력 스트림: 스트림에서 데이터를 읽는 경우

// [스트림의 종류]

//	1) 바이트 스트림
//	- 모든 처리를 1byte씩 처리, 기계 중심
//	- 대상: 영문자 + 영상, 소리, 사진 등 모든 파일
//	- 최상위 스트림: InputStream(입력), OutputStream(출력)

//	2) 문자 스트림
//	- 모든 처리를 2byte씩 처리, 사람 중심
//	- 대상: 전세계 모든 언어로 구성된 문서 파일
//	- 최상위 스트림: Reader(입력), Writer(출력)

//	3) 바이트-문자 결합
//	- 기계를 통해 입/출력한 정보를 사람이 사용할 수 있도록 입/출력
//	- 해당 클래스: InputStreamReader(입력), OutputStreamReader(출력)

//	4) 오브젝트 스트림
//	- 객체를 직렬화한 후 객체 단위로 입/출력
//	- 해당 클래스: ObjectInputStream(readObject())		>>> readObject(): 객체직렬화
//				   ObjectOutputStream(writeObject())	>>> writeObject(): 객체역직렬화


public class Ex01 {

	
	
	
}
