const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmz9934/",
            name: "ssmz9934",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmz9934/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生资助在线管系统"
        } 
    }
}
export default base
