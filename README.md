# 📝 Algorithm Study

이 저장소는 스터디에서 풀었던 알고리즘 문제를 기록하고 정리하기 위한 공간입니다.  
주로 **백준(BOJ)**, **프로그래머스(PGS)** 등의 문제 풀이를 포함합니다.

<br />

## 🎯 목표

- 꾸준한 문제 풀이 습관 만들기
- 다양한 알고리즘과 자료구조 학습
- 코드 가독성과 효율성 개선

<br />

## 📂 구조

- `/Baekjoon` : 백준 문제 풀이
- `/Programmers` : 프로그래머스 문제 풀이
- `/etc` : 그 밖의 코딩테스트 문제 풀이
- 각 폴더 안에 문제 번호 또는 이름으로 파일을 저장합니다.

<br />

## 💡 참여방법

1. 이 저장소를 `fork` 한다.
2. 자신의 이름으로 된 폴더 내에 정답 코드를 작성한다.
3. 소스코드 `commit 규칙`을 지킨다.
4. 본인 저장소에 `Push` 한다.
5. 본인 저장소에서 `Pull requests` → `New pull requests`를 열어 원본 저장소에 `PR`을 보낸다.

<br />

## 📅 업데이트 규칙

- ❗<strong>하루 최소 1문제 이상 풀기</strong>❗
- 풀이 후 주석으로 접근 방법 및 시간 복잡도 기록
- Commit + PR 규칙 지키기

<br />

## ✅ Commit 규칙

1. 자신의 Github username에 해당하는 branch로 이동
2. <code>자신의 이름 폴더/사이트명</code>에 <code>사이트이니셜\_문제번호</code>로 파일 생성<br/>(ex. <code>김우리/BOJ/B123456.java</code>, <code>김우리/programmers/P123456.java</code>)
3. 생성한 파일 상단에 주석으로 아래 정보 입력<br/><code>문제 링크: </code><br/><code>시간: ms</code><br/><code>메모리: KB</code><br/><code>접근 방법: </code>
4. 문제 풀이 코드 복붙 후 파일 저장
5. commit 메세지: [문제 출처(플랫폼)] yymmdd 문제번호 언어

- 터미널에서 작성법:

```
git commit -m "[BOJ] 250811 2557.java"
```

- 플랫폼 작성법 통일:
  - [BOJ] - 백준
  - [PGS] - 프로그래머스
  - [LTC] - 리트코드
  - [CFS] - 코드포스
  - [SEA] - 삼성SW Expert Academy
  - [ETC] - 그외

<br />

## ✅ PR 규칙

1. <code>main ← 개인 branch</code>로 PR 생성
2. PR 제목 : <code>날짜 사이트*명 문제*번호 사용\_언어</code><br/>(ex. <code>240829 프로그래머스 123456.java</code>)
3. 본문 : 공유하고 싶은 사항 자유롭게 작성
4. Reviewers에 관리자 필수 지정, 이외는 자유롭게 지정
