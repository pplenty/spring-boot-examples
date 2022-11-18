package io.pplenty.upload.controller

import io.pplenty.upload.service.Uploader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile


@RestController
@RequestMapping("/api/upload")
class UploadController @Autowired constructor(
    private val uploader: Uploader,
) {

    @PostMapping
    fun upload(@RequestBody file: MultipartFile) {
        uploader.process(file)
    }
}
