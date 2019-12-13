package top.lenconda.project10.controller;

import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/file")
public class UploadFileController {

    @PostMapping("/images")
    public String singleFileUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "请选择上传文件";
        }
        try {
            byte[] bytes = file.getBytes();
            JpaSort.Path path = (JpaSort.Path) Paths.get("upload/images/"+file.getOriginalFilename());
            Files.write((Path) path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传成功";
    }
}
