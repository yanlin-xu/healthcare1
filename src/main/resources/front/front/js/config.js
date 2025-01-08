
var projectName = '健康体检信息管理';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '体检项目',
	url: './pages/tijianxiangmu/list.html'
}, 

{
	name: '体检资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootc48o6/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"体检类型","menuJump":"列表","tableName":"tijianleixing"}],"menu":"体检类型管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"体检套餐","menuJump":"列表","tableName":"tijiantaocan"}],"menu":"体检套餐管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除"],"menu":"体检项目","menuJump":"列表","tableName":"tijianxiangmu"}],"menu":"体检项目管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除","审核","体检结果"],"menu":"体检预约","menuJump":"列表","tableName":"tijianyuyue"}],"menu":"体检预约管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","修改","删除"],"menu":"体检结果","menuJump":"列表","tableName":"tijianjieguo"}],"menu":"体检结果管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"客服信息","tableName":"chat"},{"appFrontIcon":"cuIcon-list","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"体检资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","预约"],"menu":"体检项目列表","menuJump":"列表","tableName":"tijianxiangmu"}],"menu":"体检项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","支付"],"menu":"体检预约","menuJump":"列表","tableName":"tijianyuyue"}],"menu":"体检预约管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"体检结果","menuJump":"列表","tableName":"tijianjieguo"}],"menu":"体检结果管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["查看","预约"],"menu":"体检项目列表","menuJump":"列表","tableName":"tijianxiangmu"}],"menu":"体检项目模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
