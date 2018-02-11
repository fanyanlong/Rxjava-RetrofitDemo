package com.example.administrator.mvpdemo.service.entity;

import java.util.List;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class Book {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-12-12 23:19","title":"冯小刚《芳华》将首映 葛优为其打call力挺","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/af69b4e095d44c49be0b8cd4a412292b20171212220318.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G4VJMM00038FO9.html"},{"ctime":"2017-12-12 23:19","title":"GAI央视彩排现场隔空表白女友 表示快要结婚了","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/be447f9034574827be379f4d315136fa20171212220506.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G537LK00038FO9.html"},{"ctime":"2017-12-12 23:19","title":"张惠妹听闻前绯闻男友婚变 \u201c睁大双眼\u201d尴尬回应","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/7bac0e22fa2341c4af7ec8b046a3f30020171212221810.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G5QQR300038FO9.html"},{"ctime":"2017-12-12 22:03","title":"独家：曹云金隔空喊话郭德纲：父不义，子奔他乡","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/0b443724c1f2498d965975c050ad01fa20171212124757.jpeg_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/22/D5G5V5EN00039840.html"},{"ctime":"2017-12-12 22:05","title":"窦靖童出家？工作室：仅仅是剪掉头发 与出家无关","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/46c03c8895f84941b4210ec085a4bf6d20171212231120.png_130x90x1x85.jpg","url":"http://ent.163.com/17/1212/23/D5G8SM0200038FO9.html"},{"ctime":"2017-12-12 22:18","title":"王鸥电影杀青喊话包贝尔：来，亲一个","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/catchpic/4/4a/4abdb595d7c651ece5d3a04d538a49b2.gif_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85I1GT50003803T.html"},{"ctime":"2017-12-12 22:20","title":"刘晓庆豪华别墅曝光生活惬意","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://img3.cache.netease.com/photo/0003/2016-12-13/t_C85HC0IP00AJ0003.jpg_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85HRBVJ0003803T.html"},{"ctime":"2017-12-12 23:11","title":"周冬雨晒自拍粉色内裤抢镜","description":"网易明星","picUrl":"http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/c8bce039b5ed4528bd42859a4846774220161213093854.png_180x125x1x85.jpg","url":"http://ent.163.com/16/1213/09/C85HMUVH0003803T.html"},{"ctime":"2017-10-31 14:44","title":"《米花之味》入围平遥国际电影节 贾樟柯助阵","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/718ee04ecad44abf9f9827ceb8c5140c20171031163232.jpeg","url":"http://ent.163.com/17/1031/14/D2375PVT00038793.html"},{"ctime":"2017-10-31 14:46","title":"《请赐我一双翅膀》朱圣t首演民国剧搭档炎亚纶","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/77e1284bd2fe40d0ad4b1367d852b69d20171031144720.jpeg","url":"http://ent.163.com/17/1031/14/D237A02Q00038793.html"},{"ctime":"2017-10-31 14:57","title":"金柱赫尸检结果：非心肌梗塞而是头部损伤致死","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/978ee8101e8344b7bfa7f4375bfc368a20171031145715.png","url":"http://ent.163.com/17/1031/14/D237U2CH00038FO9.html"},{"ctime":"2017-10-31 15:13","title":"章子怡苏芒盛装出席双宋婚礼气质优雅","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/c8ea1e88f51a4406964fdcb4ea30d69120171031151311.png","url":"http://ent.163.com/17/1031/15/D238R8AL00038FO9.html"},{"ctime":"2017-10-31 15:18","title":"双宋婚礼吴宇森送祝福：太太已经送了礼物给新人","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/f9c4c54bd11844368591f731d722c68020171031151731.png","url":"http://ent.163.com/17/1031/15/D2393JIS00038FO9.html"},{"ctime":"2017-10-31 15:19","title":"吴宇森：把宋慧乔当家人 太太已送她结婚礼物","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/46d11c67cee3430aaf84f052f0f750bf20171031151942.png","url":"http://ent.163.com/17/1031/15/D239693S00038FO9.html"},{"ctime":"2017-10-31 15:29","title":"新郎宋仲基帅气燕尾服现身 花束摆满新娘休息室","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/c28698d8700f468ea8e9189fe576eb9c20171031152935.png","url":"http://ent.163.com/17/1031/15/D239OE7700038793.html"},{"ctime":"2017-10-31 15:37","title":"韩星李胜基今日退伍 《花游记》可能为回归作品","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/9125d044420e441c8197b0f19141a2f220171031153715.png","url":"http://ent.163.com/17/1031/15/D23A790J00038FO9.html"},{"ctime":"2017-10-31 15:39","title":"曹曦文自带服饰进组 杀青后装备多到令人发指","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/1b6cf6958ec24ffbaa5cd908d936ccff20171031163426.jpeg","url":"http://ent.163.com/17/1031/15/D23AB1IQ000333J5.html"},{"ctime":"2017-10-31 15:47","title":"金柱赫告别式将于11月2日举行 伴父长眠家庭墓园","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/8995f1460758441a8410d93687d3651520171031154652.png","url":"http://ent.163.com/17/1031/15/D23AP04V00037VVH.html"},{"ctime":"2017-10-31 15:58","title":"古力娜扎晒万圣节妆容 俏皮呆萌变夜店小野猫","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/dc932d3e2c1f492ca944465c6a179e4420171031155814.png","url":"http://ent.163.com/17/1031/15/D23BDSCG00038FO9.html"},{"ctime":"2017-10-31 16:42","title":"章子怡晒和双宋合影 新娘宋慧乔一袭白纱笑容甜","description":"网易娱乐","picUrl":"http://cms-bucket.nosdn.127.net/f26daec5c013471b93d9f1448152481b20171031164247.png","url":"http://ent.163.com/17/1031/16/D23DUDBT00038FO9.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-12-12 23:19
         * title : 冯小刚《芳华》将首映 葛优为其打call力挺
         * description : 网易明星
         * picUrl : http://imgsize.ph.126.net/?imgurl=http://cms-bucket.nosdn.127.net/af69b4e095d44c49be0b8cd4a412292b20171212220318.png_130x90x1x85.jpg
         * url : http://ent.163.com/17/1212/22/D5G4VJMM00038FO9.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
