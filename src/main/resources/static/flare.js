var ROOT_PATH = "https://echarts.apache.org/examples";
var chartDom = document.getElementById("main");
var myChart = echarts.init(chartDom);
var option;
myChart.showLoading();
axios
  .get("http://localhost:8080/api/dimensionality/getTreeData")
  .then(function (response) {
    const data = response.data.data[0];
    console.log(data.children);
    console.log(data);
    myChart.hideLoading();
    data.children.forEach(function (datum, index) {
      index % 2 === 0 && (datum.collapsed = true);
    });
    myChart.setOption(
      (option = {
        tooltip: {
          trigger: "item",
          triggerOn: "mousemove",
        },
        series: [
          {
            type: "tree",
            data: [data],
            top: "1%",
            left: "7%",
            bottom: "1%",
            right: "20%",
            symbolSize: 7,
            label: {
              position: "left",
              verticalAlign: "middle",
              align: "right",
              fontSize: 9,
            },
            leaves: {
              label: {
                position: "right",
                verticalAlign: "middle",
                align: "left",
              },
            },
            emphasis: {
              focus: "descendant",
            },
            expandAndCollapse: true,
            animationDuration: 550,
            animationDurationUpdate: 750,
          },
        ],
      })
    );
  })
  .catch();
option && myChart.setOption(option);
