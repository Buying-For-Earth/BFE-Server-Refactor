# BFE-Server-Refactor

# BFE-server-refactor

## Table of Contents

- [Intro](#intro)
- [Install](#install)
- [Usage](#usage)
- [Branch](#branch)
- [Commit](#commit)
- [Deploy](#deploy)
- [Database](#database)

## Intro

이 레포지토리는 Buying For Earth의 서버 코드를 관리하는 레포지토리 입니다.

**landing-page** : https://buyingforearth.com/landing

**client repository** : https://github.com/Buying-For-Earth/BFE-client

**legacy server repository** : https://github.com/Buying-For-Earth/BFE-server

**server url** : 


## Install



## Usage


## Branch

`dev` : 개발 레포지토리의 메인 브랜치입니다. 새로운 기능을 추가하는 경우 꼭 이 브랜치에서 새로운 브랜치를 만들어야합니다.

`feature/{name}` : 새로운 기능을 만드는 경우 dev브랜치에서 생성하는 브랜치입니다.

`fix/{name}` : 버그수정이나 기능 수정이 일어나는 경우 dev브랜치에서 생성하는 브랜치입니다.

## Commit
커밋 메시지 형식
```text
type: Subject

body

footer
```

메시지 type은 아래와 같이 분류합니다. 소문자로 작성합니다.
```text
feat : 새로운 기능 추가
fix : 버그 수정
docs : 문서 내용 변경
style : 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우 등
refactor : 코드 리팩토링
test : 테스트 코드 작성
chore : 빌드 수정, 패키지 매니저 설정, 운영 코드 변경이 없는 경우 등
```

**Subject (제목)**

Subject(제목)은 최대 50글자가 넘지 않고, 마침표와 특수기호는 사용하지 않습니다.
영문 표기 시, 첫글자는 대문자로 표기하며 과거시제를 사용하지 않습니다. 그리고 간결하고 요점만 서술해야 합니다.

Added (X) → Add (O)


**Body (본문)**

Body (본문)은 최대한 상세히 적고, 무엇을 왜 진행했는 지 설명해야 합니다. 
만약 한 줄이 72자가 넘어가면 다음 문단으로 나눠 작성하도록 합니다.


**Footer (꼬리말)**

Footer (꼬리말)은 관련 깃허브 이슈번호를 작성합니다.

## Deploy


## Database
데이터베이스의 스키마는 [dbdiagram](https://dbdiagram.io/d/6024dbfc80d742080a3a18c7) 에서 관리되고 있습니다.







