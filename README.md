# 2021년도 3학년 1학기 소프트웨어설계공학
<h2 align=left>1분반 3조 음식주문 및 결제 시스템</h2>

## 목차

1. [배경](#1-배경)
2. [개발 환경](#2-개발-환경)
3. [디자인 패턴](#3-디자인-패턴)
4. [발표 영상](#4-발표-영상)

## 1. 배경

&nbsp;COVID-19 바이러스로 인해 언택트 쇼핑의 추세가 높아짐에 따라 전자상거래 어플리케이션이 활발하게 사용되고 있다.</br> 전자기기, 가구, 의류 등 여러 분야의 전자상거래 어플이 존재하는 가운데 가장 많이 사용되는 배달 음식 어플인 '배달의 민족'을 모티브로 하여 본 프로젝트를 기획하였다.

&nbsp; 본 프로젝트는 각 가맹점의 메뉴에 공통적인 해시태그로 메뉴를 구분하여 검색가능하게 구현할 예정이다.

## 2. 개발 환경

```
* Language : Java
* Platform : NetBeans 11.3
* DB : MySQL 5.6
* Tools : JAVA SWING
```

## 3. 디자인 패턴

### 1. Template Method 패턴</br>
입력 영상에서 차단바를 인식하면 4초간 정지한다.  <br/><br/>
![차단바 인식](image/차단바인식.png)

### 2. Singleton 패턴</br>
Image에 대한 마스킹을 진행하여 정지선을 검출하고, 터틀봇을 3초간 정지시킨다.  <br/>
Canny 알고리즘을 사용하여 기울기가 0 이 될때까지 좌우로 움직여 수평을 맞춘다.<br/>
![정지선 인식](image/정지선검출.PNG)

### 3. Strategy 패턴</br>
Canny 알고리즘을 사용하여 차선을 인식하고, 인식되는 차선에 따라 주행 방향을 설정한다.  <br/><br/>
![차선 인식](image/차선인식.png)

### 4. Memento 패턴</br>
정지 표지판의 윤곽선을 검출하여 터틀봇을 3초간 정지시킨다.  <br/><br/>
![정지표지판 인식](image/정지표지판인식.png)

## 4. 발표 영상

[![발표 영상](https://img.youtube.com/vi/yPWcp_Xn3TY/0.jpg)](https://youtu.be/yPWcp_Xn3TY))

