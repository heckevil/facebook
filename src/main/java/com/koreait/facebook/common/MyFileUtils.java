package com.koreait.facebook.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Component
public class MyFileUtils {
    @Value("${spring.servlet.multipart.location}")
    private String uploadImagePath;

    //폴더 만들기
    public void makeFolders(String path) {
        File folder = new File(path);
        folder.mkdirs();
    }

    //저장 결로 만들기
    public String getSavePath(String path) {
        return uploadImagePath + "/" + path;

    }

    //랜덤 파일명 만들기
    public String getRandomFileNm() {
        return UUID.randomUUID().toString();
    }

    //랜덤 파일명 만들기 with 확장자
    public String getRandomFileNm(String originFileNm) {
        return getRandomFileNm() + "." + getExt(originFileNm);
    }

    //랜덤 파일명 만들기
    public String getRandomFileNm(MultipartFile file) {
        return getRandomFileNm(file.getOriginalFilename());
    }

    //확장자 얻기
    public String getExt(String fileNm) {
        return fileNm.substring(fileNm.lastIndexOf(".") + 1);
    }

    //파일 저장 & 랜덤파일명
    public String trandsferTo(MultipartFile mf, String target) {
        String fileNm = getRandomFileNm(mf);
        String basePath = getSavePath(target); // 저장절대경로
        makeFolders(basePath);
        File file = new File(basePath, fileNm);

        try {
            mf.transferTo(file);

            return fileNm;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
