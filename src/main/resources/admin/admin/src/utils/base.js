const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootc48o6/",
            name: "springbootc48o6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootc48o6/fron/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "健康体检信息管理"
        } 
    }
}
export default base
