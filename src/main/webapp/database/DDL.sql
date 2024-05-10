CREATE TABLE user
(
  id          VARCHAR(50)   NOT NULL COMMENT '유저 아이디',
  password    VARCHAR(255)  NOT NULL COMMENT '유저 비밀번호',
  name        VARCHAR(30)   NOT NULL COMMENT '유저이름',
  phonenumber CHAR(13) NOT NULL UNIQUE CHECK(`phonenumber` REGEXP '^[0-9]{3}-[0-9]{4}-[0-9]{4}$') COMMENT '유저 핸드폰번호',
  email       VARCHAR(100)  UNIQUE COMMENT '유저 이메일',
  birthday    VARCHAR(6)    NOT NULL COMMENT '유저 생년월일',
  gender      ENUM('M','F') NOT NULL COMMENT '유저 성별',
  reg_date    DATETIME      NOT NULL DEFAULT(NOW()) COMMENT '가입 날짜',
  edit_date    DATETIME      NULL COMMENT '수정 날짜',
  PRIMARY KEY (id)
) COMMENT '유저';
        
CREATE TABLE board
(
  boardIndex     INT         NOT NULL AUTO_INCREMENT COMMENT '보드 인덱스',
  id             VARCHAR(50) NOT NULL COMMENT '유저 아이디',
  title          VARCHAR(50) NOT NULL COMMENT '게시판 제목',
  content        TEXT        NOT NULL COMMENT '게시판 내용',
  write_datetime timestamp    NOT NULL DEFAULT(NOW()) COMMENT '게시판 작성 시간',
  modify_datetime timestamp   NULL COMMENT '게시판 수정 시간',
  PRIMARY KEY (boardIndex)
) COMMENT '게시판';

CREATE TABLE car
(
  carnumber   VARCHAR(50) NOT NULL COMMENT '차량 번호',
  type        VARCHAR(50) NOT NULL COMMENT '차량 종류',
  oil         VARCHAR(30) NOT NULL COMMENT '기름 종류',
  info      TEXT        NULL COMMENT '차랑 정보',
  viewcount INT NOT NULL DEFAULT '0',
  price INT NOT NULL COMMENT '가격',
  name VARCHAR(50) NOT NULL COMMENT '차량명',
  PRIMARY KEY (carnumber)
) COMMENT '차량';

CREATE TABLE notice
(
  noticeIndex    INT         NOT NULL AUTO_INCREMENT COMMENT '공지사항 인덱스',
  id              VARCHAR(50) NOT NULL COMMENT '유저 아이디',
  title          VARCHAR(50) NOT NULL COMMENT '공지사항 제목',
  content        TEXT        NOT NULL COMMENT '공지사항 내용',
  write_datetime DATETIME    NOT NULL COMMENT '공지사항 작성 시간',
  mdoify_datetime DATETIME    NULL     COMMENT '공지사항 수정 시간',
  PRIMARY KEY (noticeIndex)
) COMMENT '공지사항';

CREATE TABLE reservation
(
  id                   VARCHAR(50) NOT NULL COMMENT '아이디',
  carnumber            VARCHAR(15) NOT NULL COMMENT '차랑변호',
  reservation_datetime TIMESTAMP   NOT NULL DEFAULT NOW() COMMENT '예약날짜',
  retal_datetime       TIMESTAMP   NULL     COMMENT '대여날짜',
  return_datetime	   TIMESTAMP   NOT NULL COMMENT '반납날짜',
  pay_type             VARCHAR(50) NOT NULL COMMENT '결재방법',
  pay                  INT NOT NULL COMMENT '결제금액',
  cancle               BOOLEAN     NOT NULL DEFAULT false COMMENT '취소여부',
  returncar            BOOLEAN     NOT NULL DEFAULT false COMMENT '반납여부',
  PRIMARY KEY (id, carnumber)
) COMMENT '예약';


CREATE TABLE carImage
(
  carImageindex     INT NOT NULL AUTO_INCREMENT COMMENT '인덱스',
  carnumber VARCHAR(15) NOT NULL COMMENT '차랑변호',
  imageUrl  VARCHAR(50) NOT NULL COMMENT '차량이미지 주소',
  PRIMARY KEY (carImageindex)
) COMMENT '차량이미지';

ALTER TABLE board
  ADD CONSTRAINT FK_user_TO_board
    FOREIGN KEY (id)
    REFERENCES user (id);

ALTER TABLE notice
  ADD CONSTRAINT FK_user_TO_notice
    FOREIGN KEY (id)
    REFERENCES user (id);

ALTER TABLE reservation
  ADD CONSTRAINT FK_user_TO_reservation
    FOREIGN KEY (id)
    REFERENCES user (id);

ALTER TABLE reservation
  ADD CONSTRAINT FK_car_TO_reservation
    FOREIGN KEY (carnumber)
    REFERENCES car (carnumber);

    
ALTER TABLE carImage
  ADD CONSTRAINT FK_car_TO_carImage
    FOREIGN KEY (carnumber)
    REFERENCES car (carnumber);