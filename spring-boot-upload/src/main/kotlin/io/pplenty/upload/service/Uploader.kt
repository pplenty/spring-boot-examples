package io.pplenty.upload.service

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

@Service
class Uploader {

    fun process(file: MultipartFile) {
        println("${file.name} : ${file.size}")
        val initialStream = file.inputStream
        Files.copy(initialStream, Path.of("/Users/kakao/dev/test/target.tmp"), StandardCopyOption.REPLACE_EXISTING)
        println("${file.name} : ${file.size}")
    }
}
