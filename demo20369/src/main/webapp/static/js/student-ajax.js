$(function(){
  $.ajax({
    url:"/student/findAll/1",
    type:"get",
    success:function(data1){
        var data=data1.pageList;
        var pages=data1.page;
        var currPage=data1.currPage;

        showTable(data);

         showPage(pages,currPage);
    }
  })

})

function showTable(data){
        var s="";
        for(var i=0;i<data.length;i++){
            s+="<tr>" +
                "<td><input class='form-check-input' type='checkbox'></td>" +
                "<td>"+data[i].sn+"</td>" +
                "<td>"+data[i].sname+"</td>" +
                "<td>"+data[i].college+"</td>" +
                "<td>"+data[i].classname+"</td>" +
                "<td>"+data[i].phone+"</td>" +
                "<td><a class='btn btn-sm btn-primary' href=''>查看详情</a>&nbsp;" +
                "<a class='btn btn-sm btn-success' href=''>修改</a>&nbsp;" +
                "<a class='btn btn-sm btn-danger' href=''>删除</a>&nbsp;" +
                "</td></tr>";
        }

  $("#tableBody").append(s);


}

function showPage(pages,currPage){
    var s="";

    s+="<ul class='pagination'>" +
        "<li class='page-item'> " +
        "<a class='page-link' href='#' aria-label='Previous'> " +
        "<span aria-hidden='true'>&laquo;</span> " +
        "</a></li>";


    for(var i=1;i<=pages;i++){
      if(currPage==i) {
        s += " <li class='page-item active'><a class='page-link' href='javascript:showData("+i+")'>" + i + "</a></li>";
      }else{
        s += " <li class='page-item '><a class='page-link' href='javascript:showData("+i+")'>" + i + "</a></li>";
      }
    }
          s+="<li class='page-item'>" +
              "<a class='page-link' href='#' aria-label='Next'> " +
              "<span aria-hidden='true'>&raquo;</span> " +
              "</a> </li> </ul>";


    $("#navPage").append(s);
}

function showData(currPage){
     $("#tableBody").text("");
     $("#navPage").text("");
      $.ajax({
        url:"/student/findAll/"+currPage,
        type:"get",
        success:function(data1){
          var data=data1.pageList;
          var pages=data1.page;
          var currPage=data1.currPage;

          showTable(data);

          showPage(pages,currPage);
        }
      })
}