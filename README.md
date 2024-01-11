https://mvnrepository.com/artifact/javax.servlet.jsp.jstl/jstl/1.2<br>
https://mvnrepository.com/artifact/org.apache.tiles/tiles-jsp/3.0.7<br>
http://projectlombok.org<br>
<h3>Tiles 사용 이유</h3>
Tiles = UI FRAMEWORK
UI 처리를 폭 넓게 사용할 수 있음
<h2>설정</h2>
boot 사용시
new -> others -> Spring boot -> new spring starter project

type -> Maven 설정
Packaging -> 배포를 위해 war

Group : 식별하기위한 이름
Description : MyBatis project for Spring Boot
package : kr.spring.mybatis

next

version : 3.1.7


boot 사용시 jar파일을 따로 받아와서 사용하지않아도됨
Maven : 라이브러리 자원관리

사용할 라이브러리
검색 
Spring Web
Orcale Driver
JDBC API
MyBaits framework
Validation
DevTools(Spring Boot DevToolls)

pom.xml 설정변경
8번째 줄 spring-boot-starter-parent 아래 ver. -> 2.7.17
35번째 줄 mybatis-spring-boot-starter 아래 ver. -> 2.3.1
62번째 줄 mybatis-spring-boot-starter-test 아래 ver.-> 2.3.1
